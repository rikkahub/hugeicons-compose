package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wattpad: ImageVector
    get() {
        if (_wattpad != null) {
            return _wattpad!!
        }
        _wattpad = ImageVector.Builder(
            name = "Wattpad",
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
        moveTo(6.19985f, 6.24021f)
        curveTo(7.80032f, 7.03155f, 7.53358f, 9.20773f, 7.20015f, 10.1969f)
        curveTo(9.25065f, 6.0281f, 15.0512f, 1.53785f, 15.0512f, 9.02173f)
        curveTo(15.5531f, 8.18115f, 17.059f, 6.29999f, 19.0669f, 5.5f)
        curveTo(21.5768f, 4.5f, 23.4574f, 6.5f, 20.4634f, 9.5f)
        curveTo(20.4634f, 9.5f, 18.9663f, 11f, 17.4693f, 14f)
        curveTo(15.9723f, 17f, 11.9802f, 20f, 10.7008f, 13.164f)
        curveTo(7.19976f, 22.0665f, 3.19898f, 19.594f, 2.19869f, 13.659f)
        curveTo(1.1984f, 7.72397f, 4.19927f, 5.25104f, 6.19985f, 6.24021f)
        }
        }.build()

        return _wattpad!!
    }

private var _wattpad: ImageVector? = null
