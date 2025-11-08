package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenTool02: ImageVector
    get() {
        if (_penTool02 != null) {
            return _penTool02!!
        }
        _penTool02 = ImageVector.Builder(
            name = "PenTool02",
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
        moveTo(16.4215f, 7f)
        curveTo(16.6828f, 5.81796f, 17.5116f, 3.8044f, 16.5398f, 2.73202f)
        curveTo(15.8765f, 2f, 14.6288f, 2f, 12.1335f, 2f)
        lineTo(11.8665f, 2f)
        curveTo(9.37118f, 2f, 8.12353f, 2f, 7.46018f, 2.73202f)
        curveTo(6.4884f, 3.80441f, 7.31722f, 5.81796f, 7.57854f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0068f, 14.6526f)
        lineTo(13.7868f, 20.3584f)
        curveTo(12.9774f, 21.4528f, 12.5726f, 22f, 12f, 22f)
        curveTo(11.4274f, 22f, 11.0227f, 21.4528f, 10.2132f, 20.3584f)
        lineTo(5.99325f, 14.6526f)
        curveTo(5.31656f, 13.7377f, 4.97821f, 13.2802f, 5.00109f, 12.7927f)
        curveTo(5.02396f, 12.3052f, 5.47593f, 11.7946f, 6.37986f, 10.7732f)
        curveTo(7.25108f, 9.78884f, 7.57854f, 8.76948f, 7.57854f, 7.00045f)
        lineTo(16.4215f, 7f)
        curveTo(16.4215f, 8.76902f, 16.7493f, 9.78857f, 17.6203f, 10.7731f)
        curveTo(18.5242f, 11.7947f, 18.9761f, 12.3054f, 18.9989f, 12.7929f)
        curveTo(19.0217f, 13.2803f, 18.6834f, 13.7377f, 18.0068f, 14.6526f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 14f)
        curveTo(13.0587f, 14.318f, 12.5464f, 14.5f, 12f, 14.5f)
        moveTo(12f, 14.5f)
        curveTo(11.4536f, 14.5f, 10.9413f, 14.318f, 10.5f, 14f)
        moveTo(12f, 14.5f)
        lineTo(12f, 22f)
        }
        }.build()

        return _penTool02!!
    }

private var _penTool02: ImageVector? = null
