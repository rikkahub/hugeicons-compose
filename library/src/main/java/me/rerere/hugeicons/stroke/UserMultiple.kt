package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserMultiple: ImageVector
    get() {
        if (_userMultiple != null) {
            return _userMultiple!!
        }
        _userMultiple = ImageVector.Builder(
            name = "UserMultiple",
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
        moveTo(13f, 11f)
        curveTo(13f, 8.79086f, 11.2091f, 7f, 9f, 7f)
        curveTo(6.79086f, 7f, 5f, 8.79086f, 5f, 11f)
        curveTo(5f, 13.2091f, 6.79086f, 15f, 9f, 15f)
        curveTo(11.2091f, 15f, 13f, 13.2091f, 13f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.0386f, 7.55773f)
        curveTo(11.0131f, 7.37547f, 11f, 7.18927f, 11f, 7f)
        curveTo(11f, 4.79086f, 12.7909f, 3f, 15f, 3f)
        curveTo(17.2091f, 3f, 19f, 4.79086f, 19f, 7f)
        curveTo(19f, 9.20914f, 17.2091f, 11f, 15f, 11f)
        curveTo(14.2554f, 11f, 13.5584f, 10.7966f, 12.9614f, 10.4423f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21f)
        curveTo(15f, 17.6863f, 12.3137f, 15f, 9f, 15f)
        curveTo(5.68629f, 15f, 3f, 17.6863f, 3f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 17f)
        curveTo(21f, 13.6863f, 18.3137f, 11f, 15f, 11f)
        }
        }.build()

        return _userMultiple!!
    }

private var _userMultiple: ImageVector? = null
