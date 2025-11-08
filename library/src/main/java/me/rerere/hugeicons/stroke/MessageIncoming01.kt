package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageIncoming01: ImageVector
    get() {
        if (_messageIncoming01 != null) {
            return _messageIncoming01!!
        }
        _messageIncoming01 = ImageVector.Builder(
            name = "MessageIncoming01",
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
        moveTo(21.7109f, 9.3871f)
        curveTo(21.8404f, 9.895f, 21.9249f, 10.4215f, 21.9598f, 10.9621f)
        curveTo(22.0134f, 11.7929f, 22.0134f, 12.6533f, 21.9598f, 13.4842f)
        curveTo(21.6856f, 17.7299f, 18.3536f, 21.1118f, 14.1706f, 21.3901f)
        curveTo(12.7435f, 21.485f, 11.2536f, 21.4848f, 9.8294f, 21.3901f)
        curveTo(9.33896f, 21.3574f, 8.8044f, 21.2403f, 8.34401f, 21.0505f)
        curveTo(7.83177f, 20.8394f, 7.5756f, 20.7338f, 7.44544f, 20.7498f)
        curveTo(7.31527f, 20.7659f, 7.1264f, 20.9052f, 6.74868f, 21.184f)
        curveTo(6.08268f, 21.6755f, 5.24367f, 22.0285f, 3.99943f, 21.9982f)
        curveTo(3.37026f, 21.9829f, 3.05568f, 21.9752f, 2.91484f, 21.7349f)
        curveTo(2.77401f, 21.4946f, 2.94941f, 21.1619f, 3.30021f, 20.4966f)
        curveTo(3.78674f, 19.5739f, 4.09501f, 18.5176f, 3.62791f, 17.6712f)
        curveTo(2.82343f, 16.4623f, 2.1401f, 15.0305f, 2.04024f, 13.4842f)
        curveTo(1.98659f, 12.6533f, 1.98659f, 11.7929f, 2.04024f, 10.9621f)
        curveTo(2.31441f, 6.71638f, 5.64639f, 3.33448f, 9.8294f, 3.05621f)
        curveTo(10.2156f, 3.03051f, 10.6067f, 3.01177f, 11f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 15f)
        horizontalLineTo(15.5f)
        moveTo(8.5f, 10f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 4.5f)
        lineTo(22f, 4.5f)
        moveTo(14f, 4.5f)
        curveTo(14f, 3.79977f, 15.9943f, 2.49153f, 16.5f, 2f)
        moveTo(14f, 4.5f)
        curveTo(14f, 5.20023f, 15.9943f, 6.50847f, 16.5f, 7f)
        }
        }.build()

        return _messageIncoming01!!
    }

private var _messageIncoming01: ImageVector? = null
