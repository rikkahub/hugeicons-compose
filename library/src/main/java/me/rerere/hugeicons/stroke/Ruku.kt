package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ruku: ImageVector
    get() {
        if (_ruku != null) {
            return _ruku!!
        }
        _ruku = ImageVector.Builder(
            name = "Ruku",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7.76239f)
        lineTo(18.3883f, 7.98862f)
        curveTo(19.7866f, 8.12106f, 21f, 7.08098f, 21f, 5.74989f)
        curveTo(21f, 4.50731f, 19.9365f, 3.5f, 18.6247f, 3.5f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5911f, 6.5f)
        lineTo(10.5207f, 10.3833f)
        verticalLineTo(14.8978f)
        moveTo(10.5207f, 14.8978f)
        verticalLineTo(18.5f)
        curveTo(7.28541f, 18.5f, 5.34681f, 17.8333f, 4f, 17.5f)
        verticalLineTo(9.60937f)
        curveTo(4f, 5.68298f, 7.21707f, 2.5f, 11.1855f, 2.5f)
        curveTo(12.7479f, 2.5f, 13.9299f, 2.69092f, 14.7573f, 2.91951f)
        curveTo(15.6883f, 3.17674f, 16.2316f, 4.01566f, 16.4212f, 4.9535f)
        curveTo(16.5591f, 5.6359f, 16.5158f, 6.34727f, 16.2934f, 7.0075f)
        lineTo(10.5207f, 14.8978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 18.5f)
        verticalLineTo(21.5f)
        moveTo(9f, 21.5f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 21.5f, 6.58579f, 21.5f, 6.29289f, 21.2071f)
        curveTo(6f, 20.9142f, 6f, 20.4428f, 6f, 19.5f)
        verticalLineTo(18.5f)
        moveTo(9f, 21.5f)
        horizontalLineTo(10.5f)
        }
        }.build()

        return _ruku!!
    }

private var _ruku: ImageVector? = null
