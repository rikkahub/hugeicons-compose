package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LogoutCircle02: ImageVector
    get() {
        if (_logoutCircle02 != null) {
            return _logoutCircle02!!
        }
        _logoutCircle02 = ImageVector.Builder(
            name = "LogoutCircle02",
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
        moveTo(11.9474f, 21f)
        curveTo(7.00589f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.00589f, 3f, 11.9474f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8f)
        curveTo(17f, 8f, 21f, 10.946f, 21f, 12f)
        curveTo(21f, 13.0541f, 17f, 16f, 17f, 16f)
        moveTo(20.5f, 12f)
        horizontalLineTo(9f)
        }
        }.build()

        return _logoutCircle02!!
    }

private var _logoutCircle02: ImageVector? = null
