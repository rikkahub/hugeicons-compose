package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MessageCancel01: ImageVector
    get() {
        if (_messageCancel01 != null) {
            return _messageCancel01!!
        }
        _messageCancel01 = ImageVector.Builder(
            name = "MessageCancel01",
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
        moveTo(12.5f, 3.00372f)
        curveTo(11.6049f, 2.99039f, 10.7047f, 3.01289f, 9.8294f, 3.07107f)
        curveTo(5.64639f, 3.34913f, 2.31441f, 6.72838f, 2.04024f, 10.9707f)
        curveTo(1.98659f, 11.8009f, 1.98659f, 12.6607f, 2.04024f, 13.4909f)
        curveTo(2.1401f, 15.036f, 2.82343f, 16.4666f, 3.62791f, 17.6746f)
        curveTo(4.09501f, 18.5203f, 3.78674f, 19.5758f, 3.30021f, 20.4978f)
        curveTo(2.94941f, 21.1626f, 2.77401f, 21.495f, 2.91484f, 21.7351f)
        curveTo(3.05568f, 21.9752f, 3.37026f, 21.9829f, 3.99943f, 21.9982f)
        curveTo(5.24367f, 22.0285f, 6.08268f, 21.6757f, 6.74868f, 21.1846f)
        curveTo(7.1264f, 20.9061f, 7.31527f, 20.7668f, 7.44544f, 20.7508f)
        curveTo(7.5756f, 20.7348f, 7.83177f, 20.8403f, 8.34401f, 21.0513f)
        curveTo(8.8044f, 21.2409f, 9.33896f, 21.3579f, 9.8294f, 21.3905f)
        curveTo(11.2536f, 21.4852f, 12.7435f, 21.4854f, 14.1706f, 21.3905f)
        curveTo(18.3536f, 21.1125f, 21.6856f, 17.7332f, 21.9598f, 13.4909f)
        curveTo(22.0021f, 12.836f, 22.011f, 12.1627f, 21.9866f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 2f)
        lineTo(22.0001f, 8f)
        moveTo(16f, 8f)
        lineTo(22.0001f, 2f)
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
        }.build()

        return _messageCancel01!!
    }

private var _messageCancel01: ImageVector? = null
