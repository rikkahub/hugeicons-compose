package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LegalDocument01: ImageVector
    get() {
        if (_legalDocument01 != null) {
            return _legalDocument01!!
        }
        _legalDocument01 = ImageVector.Builder(
            name = "LegalDocument01",
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
        moveTo(3f, 14f)
        verticalLineTo(10f)
        curveTo(3f, 6.22876f, 3f, 4.34315f, 4.17157f, 3.17157f)
        curveTo(5.34315f, 2f, 7.22876f, 2f, 11f, 2f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 2f, 18.6569f, 2f, 19.8284f, 3.17157f)
        curveTo(21f, 4.34315f, 21f, 6.22876f, 21f, 10f)
        verticalLineTo(14f)
        curveTo(21f, 17.7712f, 21f, 19.6569f, 19.8284f, 20.8284f)
        curveTo(18.6569f, 22f, 16.7712f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
        curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.3333f, 10.6667f)
        curveTo(12.3883f, 11.7216f, 13.7778f, 12.7937f, 13.7778f, 12.7937f)
        lineTo(15.6825f, 10.8889f)
        curveTo(15.6825f, 10.8889f, 14.6105f, 9.49939f, 13.5556f, 8.44444f)
        curveTo(12.5006f, 7.3895f, 11.1111f, 6.31746f, 11.1111f, 6.31746f)
        lineTo(9.20635f, 8.22222f)
        curveTo(9.20635f, 8.22222f, 10.2784f, 9.61172f, 11.3333f, 10.6667f)
        moveTo(11.3333f, 10.6667f)
        lineTo(8f, 14f)
        moveTo(16f, 10.5714f)
        lineTo(13.4603f, 13.1111f)
        moveTo(11.4286f, 6f)
        lineTo(8.88889f, 8.53968f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18f)
        horizontalLineTo(16f)
        }
        }.build()

        return _legalDocument01!!
    }

private var _legalDocument01: ImageVector? = null
