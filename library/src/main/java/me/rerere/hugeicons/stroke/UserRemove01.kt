package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserRemove01: ImageVector
    get() {
        if (_userRemove01 != null) {
            return _userRemove01!!
        }
        _userRemove01 = ImageVector.Builder(
            name = "UserRemove01",
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
        moveTo(14.5f, 8f)
        curveTo(14.5f, 5.23858f, 12.2614f, 3f, 9.5f, 3f)
        curveTo(6.73858f, 3f, 4.5f, 5.23858f, 4.5f, 8f)
        curveTo(4.5f, 10.7614f, 6.73858f, 13f, 9.5f, 13f)
        curveTo(12.2614f, 13f, 14.5f, 10.7614f, 14.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 21f)
        lineTo(18.5f, 18f)
        moveTo(18.5f, 18f)
        lineTo(21.5f, 15f)
        moveTo(18.5f, 18f)
        lineTo(15.5f, 15f)
        moveTo(18.5f, 18f)
        lineTo(21.5f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 20f)
        curveTo(2.5f, 16.134f, 5.63401f, 13f, 9.5f, 13f)
        curveTo(10.775f, 13f, 11.9704f, 13.3409f, 13f, 13.9365f)
        }
        }.build()

        return _userRemove01!!
    }

private var _userRemove01: ImageVector? = null
