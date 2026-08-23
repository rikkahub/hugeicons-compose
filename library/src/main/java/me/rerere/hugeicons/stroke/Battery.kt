package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Battery: ImageVector
    get() {
        if (_battery != null) {
            return _battery!!
        }
        _battery = ImageVector.Builder(
            name = "Battery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 18f)
            horizontalLineTo(16.5f)
            curveTo(16.9644f, 18f, 17.1966f, 18f, 17.3916f, 17.9743f)
            curveTo(18.7378f, 17.7971f, 19.7971f, 16.7378f, 19.9743f, 15.3916f)
            curveTo(20f, 15.1966f, 20f, 14.9644f, 20f, 14.5f)
            curveTo(21.1046f, 14.5f, 22f, 13.6046f, 22f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(22f, 10.3954f, 21.1046f, 9.5f, 20f, 9.5f)
            curveTo(20f, 9.03558f, 20f, 8.80337f, 19.9743f, 8.60842f)
            curveTo(19.7971f, 7.26222f, 18.7378f, 6.2029f, 17.3916f, 6.02567f)
            curveTo(17.1966f, 6f, 16.9644f, 6f, 16.5f, 6f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 6f, 3.75736f, 6f, 2.87868f, 6.87868f)
            curveTo(2f, 7.75736f, 2f, 9.17157f, 2f, 12f)
            curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
            curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
            close()
        }
        }.build()

        return _battery!!
    }

private var _battery: ImageVector? = null
