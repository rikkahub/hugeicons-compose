package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserAdd01: ImageVector
    get() {
        if (_userAdd01 != null) {
            return _userAdd01!!
        }
        _userAdd01 = ImageVector.Builder(
            name = "UserAdd01",
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
        moveTo(15f, 8f)
        curveTo(15f, 5.23858f, 12.7614f, 3f, 10f, 3f)
        curveTo(7.23858f, 3f, 5f, 5.23858f, 5f, 8f)
        curveTo(5f, 10.7614f, 7.23858f, 13f, 10f, 13f)
        curveTo(12.7614f, 13f, 15f, 10.7614f, 15f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 21f)
        lineTo(17.5f, 14f)
        moveTo(14f, 17.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 20f)
        curveTo(3f, 16.134f, 6.13401f, 13f, 10f, 13f)
        curveTo(11.4872f, 13f, 12.8662f, 13.4638f, 14f, 14.2547f)
        }
        }.build()

        return _userAdd01!!
    }

private var _userAdd01: ImageVector? = null
