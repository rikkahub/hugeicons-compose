package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Idea: ImageVector
    get() {
        if (_idea != null) {
            return _idea!!
        }
        _idea = ImageVector.Builder(
            name = "Idea",
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
        moveTo(5.14286f, 14f)
        curveTo(4.41735f, 12.8082f, 4f, 11.4118f, 4f, 9.91886f)
        curveTo(4f, 5.54539f, 7.58172f, 2f, 12f, 2f)
        curveTo(16.4183f, 2f, 20f, 5.54539f, 20f, 9.91886f)
        curveTo(20f, 11.4118f, 19.5827f, 12.8082f, 18.8571f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.38287f, 17.0982f)
        curveTo(7.291f, 16.8216f, 7.24507f, 16.6833f, 7.25042f, 16.5713f)
        curveTo(7.26174f, 16.3343f, 7.41114f, 16.1262f, 7.63157f, 16.0405f)
        curveTo(7.73579f, 16f, 7.88105f, 16f, 8.17157f, 16f)
        horizontalLineTo(15.8284f)
        curveTo(16.119f, 16f, 16.2642f, 16f, 16.3684f, 16.0405f)
        curveTo(16.5889f, 16.1262f, 16.7383f, 16.3343f, 16.7496f, 16.5713f)
        curveTo(16.7549f, 16.6833f, 16.709f, 16.8216f, 16.6171f, 17.0982f)
        curveTo(16.4473f, 17.6094f, 16.3624f, 17.8651f, 16.2315f, 18.072f)
        curveTo(15.9572f, 18.5056f, 15.5272f, 18.8167f, 15.0306f, 18.9408f)
        curveTo(14.7935f, 19f, 14.525f, 19f, 13.9881f, 19f)
        horizontalLineTo(10.0119f)
        curveTo(9.47495f, 19f, 9.2065f, 19f, 8.96944f, 18.9408f)
        curveTo(8.47283f, 18.8167f, 8.04281f, 18.5056f, 7.7685f, 18.072f)
        curveTo(7.63755f, 17.8651f, 7.55266f, 17.6094f, 7.38287f, 17.0982f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 19f)
        lineTo(14.8707f, 19.6466f)
        curveTo(14.7293f, 20.3537f, 14.6586f, 20.7072f, 14.5001f, 20.9866f)
        curveTo(14.2552f, 21.4185f, 13.8582f, 21.7439f, 13.3866f, 21.8994f)
        curveTo(13.0816f, 22f, 12.7211f, 22f, 12f, 22f)
        curveTo(11.2789f, 22f, 10.9184f, 22f, 10.6134f, 21.8994f)
        curveTo(10.1418f, 21.7439f, 9.74484f, 21.4185f, 9.49987f, 20.9866f)
        curveTo(9.34144f, 20.7072f, 9.27073f, 20.3537f, 9.12932f, 19.6466f)
        lineTo(9f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        verticalLineTo(11f)
        }
        }.build()

        return _idea!!
    }

private var _idea: ImageVector? = null
