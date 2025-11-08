package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AutoConversations: ImageVector
    get() {
        if (_autoConversations != null) {
            return _autoConversations!!
        }
        _autoConversations = ImageVector.Builder(
            name = "AutoConversations",
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
        moveTo(4.94436f, 8.04069f)
        lineTo(10.8282f, 8.04069f)
        moveTo(2f, 18f)
        lineTo(7.49762f, 12.5862f)
        curveTo(7.70914f, 12.3779f, 8.03957f, 12.3544f, 8.27806f, 12.5308f)
        lineTo(12.5239f, 15.6712f)
        curveTo(12.774f, 15.8563f, 13.1229f, 15.8204f, 13.3306f, 15.5883f)
        lineTo(21.2849f, 6.70262f)
        moveTo(18.1084f, 6f)
        horizontalLineTo(20.9306f)
        curveTo(21.4785f, 6f, 21.9259f, 6.44077f, 21.9371f, 6.99179f)
        lineTo(22f, 10.0649f)
        }
        }.build()

        return _autoConversations!!
    }

private var _autoConversations: ImageVector? = null
