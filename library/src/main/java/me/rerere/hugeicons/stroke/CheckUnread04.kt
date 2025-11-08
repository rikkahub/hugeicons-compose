package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckUnread04: ImageVector
    get() {
        if (_checkUnread04 != null) {
            return _checkUnread04!!
        }
        _checkUnread04 = ImageVector.Builder(
            name = "CheckUnread04",
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
        moveTo(3.5f, 5f)
        lineTo(17.5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 13.5f)
        lineTo(6f, 17f)
        lineTo(6.73256f, 16.2326f)
        moveTo(16.5f, 6f)
        lineTo(12.593f, 10.093f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 13.5f)
        lineTo(11f, 17f)
        lineTo(13.1977f, 14.6977f)
        moveTo(21.5f, 6f)
        lineTo(15.1512f, 12.6512f)
        }
        }.build()

        return _checkUnread04!!
    }

private var _checkUnread04: ImageVector? = null
