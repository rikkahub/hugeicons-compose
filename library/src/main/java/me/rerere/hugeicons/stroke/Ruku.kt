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
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 7.76239f)
        lineTo(17.8883f, 7.98862f)
        curveTo(19.2866f, 8.12106f, 20.5f, 7.08098f, 20.5f, 5.74989f)
        curveTo(20.5f, 4.50731f, 19.4365f, 3.5f, 18.1247f, 3.5f)
        horizontalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0911f, 6.5f)
        lineTo(10.0207f, 10.3833f)
        verticalLineTo(14.8978f)
        moveTo(10.0207f, 14.8978f)
        verticalLineTo(18.5f)
        curveTo(6.78541f, 18.5f, 4.84681f, 17.8333f, 3.5f, 17.5f)
        verticalLineTo(9.60937f)
        curveTo(3.5f, 5.68298f, 6.71707f, 2.5f, 10.6855f, 2.5f)
        curveTo(12.2479f, 2.5f, 13.4299f, 2.69092f, 14.2573f, 2.91951f)
        curveTo(15.1883f, 3.17674f, 15.7316f, 4.01566f, 15.9212f, 4.9535f)
        curveTo(16.0591f, 5.6359f, 16.0158f, 6.34727f, 15.7934f, 7.0075f)
        lineTo(10.0207f, 14.8978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 18.5f)
        verticalLineTo(21.5f)
        moveTo(8.5f, 21.5f)
        horizontalLineTo(7.5f)
        curveTo(6.55719f, 21.5f, 6.08579f, 21.5f, 5.79289f, 21.2071f)
        curveTo(5.5f, 20.9142f, 5.5f, 20.4428f, 5.5f, 19.5f)
        verticalLineTo(18.5f)
        moveTo(8.5f, 21.5f)
        horizontalLineTo(10f)
        }
        }.build()

        return _ruku!!
    }

private var _ruku: ImageVector? = null
