package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LogoutCircle01: ImageVector
    get() {
        if (_logoutCircle01 != null) {
            return _logoutCircle01!!
        }
        _logoutCircle01 = ImageVector.Builder(
            name = "LogoutCircle01",
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
        moveTo(18.5f, 4.40041f)
        curveTo(16.752f, 2.9039f, 14.4815f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(14.4815f, 22f, 16.752f, 21.0961f, 18.5f, 19.5996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        curveTo(18f, 8f, 22f, 10.946f, 22f, 12f)
        curveTo(22f, 13.0541f, 18f, 16f, 18f, 16f)
        moveTo(21.5f, 12f)
        horizontalLineTo(9f)
        }
        }.build()

        return _logoutCircle01!!
    }

private var _logoutCircle01: ImageVector? = null
