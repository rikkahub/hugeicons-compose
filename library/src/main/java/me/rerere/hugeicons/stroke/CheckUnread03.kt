package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckUnread03: ImageVector
    get() {
        if (_checkUnread03 != null) {
            return _checkUnread03!!
        }
        _checkUnread03 = ImageVector.Builder(
            name = "CheckUnread03",
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
        moveTo(5f, 14f)
        lineTo(8.5f, 17.5f)
        lineTo(12.8953f, 12.8953f)
        moveTo(19f, 6.5f)
        lineTo(14.8488f, 10.8488f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 5f)
        lineTo(19f, 19f)
        }
        }.build()

        return _checkUnread03!!
    }

private var _checkUnread03: ImageVector? = null
