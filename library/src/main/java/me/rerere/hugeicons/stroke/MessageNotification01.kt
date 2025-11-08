package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageNotification01: ImageVector
    get() {
        if (_messageNotification01 != null) {
            return _messageNotification01!!
        }
        _messageNotification01 = ImageVector.Builder(
            name = "MessageNotification01",
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
        moveTo(21.9598f, 10.9707f)
        curveTo(22.0134f, 11.8009f, 22.0134f, 12.6607f, 21.9598f, 13.4909f)
        curveTo(21.6856f, 17.7332f, 18.3536f, 21.1125f, 14.1706f, 21.3905f)
        curveTo(12.7435f, 21.4854f, 11.2536f, 21.4852f, 9.8294f, 21.3905f)
        curveTo(9.33896f, 21.3579f, 8.8044f, 21.2409f, 8.34401f, 21.0513f)
        curveTo(7.83177f, 20.8403f, 7.5756f, 20.7348f, 7.44544f, 20.7508f)
        curveTo(7.31527f, 20.7668f, 7.1264f, 20.9061f, 6.74868f, 21.1846f)
        curveTo(6.08268f, 21.6757f, 5.24367f, 22.0285f, 3.99943f, 21.9982f)
        curveTo(3.37026f, 21.9829f, 3.05568f, 21.9752f, 2.91484f, 21.7351f)
        curveTo(2.77401f, 21.495f, 2.94941f, 21.1626f, 3.30021f, 20.4978f)
        curveTo(3.78674f, 19.5758f, 4.09501f, 18.5203f, 3.62791f, 17.6746f)
        curveTo(2.82343f, 16.4666f, 2.1401f, 15.036f, 2.04024f, 13.4909f)
        curveTo(1.98659f, 12.6607f, 1.98659f, 11.8009f, 2.04024f, 10.9707f)
        curveTo(2.31441f, 6.72838f, 5.64639f, 3.34913f, 9.8294f, 3.07107f)
        curveTo(11.0318f, 2.99114f, 11.2812f, 2.97856f, 12.5f, 3.03368f)
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
        moveTo(22f, 5.5f)
        curveTo(22f, 7.433f, 20.433f, 9f, 18.5f, 9f)
        curveTo(16.567f, 9f, 15f, 7.433f, 15f, 5.5f)
        curveTo(15f, 3.567f, 16.567f, 2f, 18.5f, 2f)
        curveTo(20.433f, 2f, 22f, 3.567f, 22f, 5.5f)
        }
        }.build()

        return _messageNotification01!!
    }

private var _messageNotification01: ImageVector? = null
