package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoonLanding: ImageVector
    get() {
        if (_moonLanding != null) {
            return _moonLanding!!
        }
        _moonLanding = ImageVector.Builder(
            name = "MoonLanding",
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
        moveTo(12f, 12f)
        curveTo(7.46544f, 12f, 3.62948f, 14.9642f, 2.35747f, 19.044f)
        curveTo(1.99646f, 20.2019f, 1.81595f, 20.7809f, 2.26968f, 21.3904f)
        curveTo(2.7234f, 22f, 3.46112f, 22f, 4.93655f, 22f)
        horizontalLineTo(19.0634f)
        curveTo(20.5389f, 22f, 21.2766f, 22f, 21.7303f, 21.3904f)
        curveTo(22.184f, 20.7809f, 22.0035f, 20.2019f, 21.6425f, 19.044f)
        curveTo(20.3705f, 14.9642f, 16.5346f, 12f, 12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9998f, 17f)
        horizontalLineTo(15.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(12f, 20.3431f, 10.6569f, 19f, 9f, 19f)
        curveTo(7.34315f, 19f, 6f, 20.3431f, 6f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(7.5f)
        moveTo(12f, 7.5f)
        verticalLineTo(5f)
        curveTo(12f, 3.58579f, 12f, 2.87868f, 12.4393f, 2.43934f)
        curveTo(12.8787f, 2f, 13.5858f, 2f, 15f, 2f)
        horizontalLineTo(17.25f)
        curveTo(18.4228f, 2f, 19.0092f, 2f, 19.4131f, 2.30997f)
        curveTo(19.5171f, 2.38977f, 19.6102f, 2.48286f, 19.69f, 2.58686f)
        curveTo(20f, 2.99082f, 20f, 3.57721f, 20f, 4.75f)
        curveTo(20f, 5.92279f, 20f, 6.50918f, 19.69f, 6.91314f)
        curveTo(19.6102f, 7.01714f, 19.5171f, 7.11023f, 19.4131f, 7.19003f)
        curveTo(19.0092f, 7.5f, 18.4228f, 7.5f, 17.25f, 7.5f)
        horizontalLineTo(12f)
        }
        }.build()

        return _moonLanding!!
    }

private var _moonLanding: ImageVector? = null
