package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DigitalClock: ImageVector
    get() {
        if (_digitalClock != null) {
            return _digitalClock!!
        }
        _digitalClock = ImageVector.Builder(
            name = "DigitalClock",
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
        moveTo(5f, 19.0001f)
        verticalLineTo(21.0001f)
        moveTo(19f, 19.0001f)
        verticalLineTo(21.0001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
        curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
        verticalLineTo(13f)
        curveTo(2f, 15.8284f, 2f, 17.2426f, 2.87868f, 18.1213f)
        curveTo(3.75736f, 19f, 5.17157f, 19f, 8f, 19f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 19f, 20.2426f, 19f, 21.1213f, 18.1213f)
        curveTo(22f, 17.2426f, 22f, 15.8284f, 22f, 13f)
        verticalLineTo(12f)
        curveTo(22f, 9.17157f, 22f, 7.75736f, 21.1213f, 6.87868f)
        curveTo(20.2426f, 6f, 18.8284f, 6f, 16f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        lineTo(7.0883f, 5.73509f)
        curveTo(7.52832f, 4.41505f, 7.74832f, 3.75503f, 8.2721f, 3.37752f)
        curveTo(8.79587f, 3f, 9.49159f, 3f, 10.883f, 3f)
        horizontalLineTo(13.117f)
        curveTo(14.5084f, 3f, 15.2041f, 3f, 15.7279f, 3.37752f)
        curveTo(16.2517f, 3.75503f, 16.4717f, 4.41505f, 16.9117f, 5.73509f)
        lineTo(17f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 13.75f)
        verticalLineTo(11.25f)
        curveTo(19f, 10.5597f, 18.4404f, 10f, 17.75f, 10f)
        curveTo(17.0596f, 10f, 16.5f, 10.5597f, 16.5f, 11.25f)
        verticalLineTo(13.75f)
        curveTo(16.5f, 14.4404f, 17.0596f, 15f, 17.75f, 15f)
        curveTo(18.4404f, 15f, 19f, 14.4404f, 19f, 13.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 13.75f)
        verticalLineTo(11.25f)
        curveTo(13.5f, 10.5596f, 12.9404f, 10f, 12.25f, 10f)
        curveTo(11.5596f, 10f, 11f, 10.5596f, 11f, 11.25f)
        verticalLineTo(13.75f)
        curveTo(11f, 14.4404f, 11.5596f, 15f, 12.25f, 15f)
        curveTo(12.9404f, 15f, 13.5f, 14.4403f, 13.5f, 13.75f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.99996f, 11f)
        horizontalLineTo(8.00894f)
        moveTo(7.99102f, 14f)
        horizontalLineTo(8f)
        }
        }.build()

        return _digitalClock!!
    }

private var _digitalClock: ImageVector? = null
