package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserCheck01: ImageVector
    get() {
        if (_userCheck01 != null) {
            return _userCheck01!!
        }
        _userCheck01 = ImageVector.Builder(
            name = "UserCheck01",
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
        moveTo(3f, 20f)
        curveTo(3f, 16.134f, 6.13401f, 13f, 10f, 13f)
        curveTo(11.9587f, 13f, 13.7295f, 13.8045f, 15f, 15.101f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 18.5f)
        curveTo(13f, 18.5f, 14.3485f, 19.0067f, 15f, 21f)
        curveTo(15f, 21f, 18.1765f, 16f, 21f, 15f)
        }
        }.build()

        return _userCheck01!!
    }

private var _userCheck01: ImageVector? = null
