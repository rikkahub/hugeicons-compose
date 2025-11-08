package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserBlock01: ImageVector
    get() {
        if (_userBlock01 != null) {
            return _userBlock01!!
        }
        _userBlock01 = ImageVector.Builder(
            name = "UserBlock01",
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
        moveTo(2.5f, 20f)
        curveTo(2.5f, 16.134f, 5.63401f, 13f, 9.5f, 13f)
        curveTo(10.5736f, 13f, 11.5907f, 13.2417f, 12.5f, 13.6736f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.55f, 15.05f)
        lineTo(20.45f, 19.95f)
        moveTo(21.5f, 17.5f)
        curveTo(21.5f, 15.567f, 19.933f, 14f, 18f, 14f)
        curveTo(16.067f, 14f, 14.5f, 15.567f, 14.5f, 17.5f)
        curveTo(14.5f, 19.433f, 16.067f, 21f, 18f, 21f)
        curveTo(19.933f, 21f, 21.5f, 19.433f, 21.5f, 17.5f)
        }
        }.build()

        return _userBlock01!!
    }

private var _userBlock01: ImageVector? = null
