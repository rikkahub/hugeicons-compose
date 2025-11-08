package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckUnread01: ImageVector
    get() {
        if (_checkUnread01 != null) {
            return _checkUnread01!!
        }
        _checkUnread01 = ImageVector.Builder(
            name = "CheckUnread01",
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
        moveTo(5f, 14.5f)
        curveTo(5f, 14.5f, 7f, 15f, 8.5f, 18f)
        curveTo(8.5f, 18f, 10.1618f, 15.2596f, 12.4759f, 12.4759f)
        moveTo(19f, 7f)
        curveTo(17.4539f, 7.57366f, 15.8473f, 8.86531f, 14.3695f, 10.3695f)
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

        return _checkUnread01!!
    }

private var _checkUnread01: ImageVector? = null
