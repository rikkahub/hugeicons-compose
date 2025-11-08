package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mining02: ImageVector
    get() {
        if (_mining02 != null) {
            return _mining02!!
        }
        _mining02 = ImageVector.Builder(
            name = "Mining02",
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
        moveTo(14.8814f, 5.18592f)
        curveTo(13.459f, 4.31437f, 9.8081f, 2.64142f, 6.51949f, 3.06842f)
        curveTo(8.50877f, 4.43842f, 9.55528f, 5.17528f, 12.3785f, 7.68884f)
        moveTo(18.8139f, 9.11839f)
        curveTo(19.6855f, 10.5408f, 21.3585f, 14.1917f, 20.9315f, 17.4803f)
        curveTo(19.5614f, 15.491f, 18.8246f, 14.4445f, 16.311f, 11.6213f)
        moveTo(10.4727f, 11.4182f)
        lineTo(3.4233f, 18.4675f)
        curveTo(2.85149f, 19.0393f, 2.86008f, 19.975f, 3.44248f, 20.5574f)
        curveTo(4.02489f, 21.1398f, 4.96056f, 21.1484f, 5.53237f, 20.5766f)
        lineTo(12.5818f, 13.5272f)
        moveTo(11.9865f, 9.22552f)
        lineTo(14.7742f, 12.0132f)
        curveTo(15.0838f, 12.3228f, 15.5845f, 12.3239f, 15.8927f, 12.0158f)
        lineTo(19.3464f, 8.56208f)
        curveTo(19.6546f, 8.25393f, 19.6534f, 7.75319f, 19.3439f, 7.44364f)
        lineTo(16.5561f, 4.65592f)
        curveTo(16.2466f, 4.34637f, 15.7458f, 4.34523f, 15.4377f, 4.65338f)
        lineTo(11.9839f, 8.10708f)
        curveTo(11.6758f, 8.41523f, 11.6769f, 8.91597f, 11.9865f, 9.22552f)
        }
        }.build()

        return _mining02!!
    }

private var _mining02: ImageVector? = null
