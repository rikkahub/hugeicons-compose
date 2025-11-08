package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserShield01: ImageVector
    get() {
        if (_userShield01 != null) {
            return _userShield01!!
        }
        _userShield01 = ImageVector.Builder(
            name = "UserShield01",
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
        moveTo(14.5f, 7.5f)
        curveTo(14.5f, 4.73858f, 12.2614f, 2.5f, 9.5f, 2.5f)
        curveTo(6.73858f, 2.5f, 4.5f, 4.73858f, 4.5f, 7.5f)
        curveTo(4.5f, 10.2614f, 6.73858f, 12.5f, 9.5f, 12.5f)
        curveTo(12.2614f, 12.5f, 14.5f, 10.2614f, 14.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 19.5f)
        curveTo(2.5f, 15.634f, 5.63401f, 12.5f, 9.5f, 12.5f)
        curveTo(10.5736f, 12.5f, 11.5907f, 12.7417f, 12.5f, 13.1736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17f)
        verticalLineTo(14.5f)
        curveTo(19.5f, 14.5f, 18f, 13.5f, 18f, 13.5f)
        curveTo(18f, 13.5f, 16.5f, 14.5f, 14.5f, 14.5f)
        verticalLineTo(17f)
        curveTo(14.5f, 20.5f, 18f, 21.5f, 18f, 21.5f)
        curveTo(18f, 21.5f, 21.5f, 20.5f, 21.5f, 17f)
        }
        }.build()

        return _userShield01!!
    }

private var _userShield01: ImageVector? = null
