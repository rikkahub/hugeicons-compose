package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Savings: ImageVector
    get() {
        if (_savings != null) {
            return _savings!!
        }
        _savings = ImageVector.Builder(
            name = "Savings",
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
        moveTo(5f, 13.5f)
        horizontalLineTo(3f)
        curveTo(2.44772f, 13.5f, 2f, 13.9477f, 2f, 14.5f)
        verticalLineTo(21f)
        curveTo(2f, 21.5523f, 2.44772f, 22f, 3f, 22f)
        horizontalLineTo(5f)
        curveTo(5.55228f, 22f, 6f, 21.5523f, 6f, 21f)
        verticalLineTo(14.5f)
        curveTo(6f, 13.9477f, 5.55228f, 13.5f, 5f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 14.5f)
        horizontalLineTo(11.75f)
        curveTo(12.4404f, 14.5f, 13f, 15.0596f, 13f, 15.75f)
        curveTo(13f, 16.4404f, 12.4404f, 17f, 11.75f, 17f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.9998f)
        horizontalLineTo(14.6917f)
        curveTo(15.5417f, 16.9998f, 16.3697f, 16.729f, 17.0554f, 16.2267f)
        lineTo(19.6836f, 14.3015f)
        curveTo(20.2549f, 13.8584f, 21.0678f, 13.9088f, 21.5796f, 14.4192f)
        curveTo(22.1734f, 15.0112f, 22.1328f, 15.9828f, 21.4918f, 16.5236f)
        lineTo(17.0951f, 20.1022f)
        curveTo(16.3817f, 20.6828f, 15.49f, 20.9998f, 14.5701f, 20.9998f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 7f)
        curveTo(19f, 9.76133f, 16.7614f, 12f, 14f, 12f)
        curveTo(11.2386f, 12f, 9f, 9.76133f, 9f, 7f)
        curveTo(9f, 4.23857f, 11.2386f, 2f, 14f, 2f)
        curveTo(16.7614f, 2f, 19f, 4.23857f, 19f, 7f)
        }
        }.build()

        return _savings!!
    }

private var _savings: ImageVector? = null
