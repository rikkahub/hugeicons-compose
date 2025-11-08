package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageBlocked: ImageVector
    get() {
        if (_messageBlocked != null) {
            return _messageBlocked!!
        }
        _messageBlocked = ImageVector.Builder(
            name = "MessageBlocked",
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
        moveTo(18f, 19.6543f)
        curveTo(16.8738f, 20.3575f, 15.5698f, 20.7975f, 14.1706f, 20.8905f)
        curveTo(12.7435f, 20.9854f, 11.2536f, 20.9852f, 9.8294f, 20.8905f)
        curveTo(9.33896f, 20.8579f, 8.8044f, 20.7409f, 8.34401f, 20.5513f)
        curveTo(7.83177f, 20.3403f, 7.5756f, 20.2348f, 7.44544f, 20.2508f)
        curveTo(7.31527f, 20.2668f, 7.1264f, 20.4061f, 6.74868f, 20.6846f)
        curveTo(6.08268f, 21.1757f, 5.24367f, 21.5285f, 3.99943f, 21.4982f)
        curveTo(3.37026f, 21.4829f, 3.05568f, 21.4752f, 2.91484f, 21.2351f)
        curveTo(2.77401f, 20.995f, 2.94941f, 20.6626f, 3.30021f, 19.9978f)
        curveTo(3.78674f, 19.0758f, 4.09501f, 18.0203f, 3.62791f, 17.1746f)
        curveTo(2.82343f, 15.9666f, 2.1401f, 14.536f, 2.04024f, 12.9909f)
        curveTo(1.98659f, 12.1607f, 1.98659f, 11.3009f, 2.04024f, 10.4707f)
        curveTo(2.16123f, 8.5986f, 2.8777f, 6.84362f, 4f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 3.51873f)
        curveTo(7.5057f, 2.98397f, 8.63273f, 2.65062f, 9.8294f, 2.57107f)
        curveTo(11.2536f, 2.47641f, 12.7435f, 2.47621f, 14.1706f, 2.57107f)
        curveTo(18.3536f, 2.84913f, 21.6856f, 6.22838f, 21.9598f, 10.4707f)
        curveTo(22.0134f, 11.3009f, 22.0134f, 12.1607f, 21.9598f, 12.9909f)
        curveTo(21.8508f, 14.6771f, 21.2587f, 16.227f, 20.3221f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3f)
        lineTo(22f, 23f)
        }
        }.build()

        return _messageBlocked!!
    }

private var _messageBlocked: ImageVector? = null
