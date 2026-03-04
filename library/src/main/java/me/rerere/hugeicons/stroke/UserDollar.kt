package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserDollar: ImageVector
    get() {
        if (_userDollar != null) {
            return _userDollar!!
        }
        _userDollar = ImageVector.Builder(
            name = "UserDollar",
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
        moveTo(15f, 7f)
        curveTo(15f, 4.23858f, 12.7614f, 2f, 10f, 2f)
        curveTo(7.23858f, 2f, 5f, 4.23858f, 5f, 7f)
        curveTo(5f, 9.76142f, 7.23858f, 12f, 10f, 12f)
        curveTo(12.7614f, 12f, 15f, 9.76142f, 15f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 14.5f)
        horizontalLineTo(16.5f)
        curveTo(15.6716f, 14.5f, 15f, 15.1716f, 15f, 16f)
        curveTo(15f, 16.8284f, 15.6716f, 17.5f, 16.5f, 17.5f)
        horizontalLineTo(19.5f)
        curveTo(20.3284f, 17.5f, 21f, 18.1716f, 21f, 19f)
        curveTo(21f, 19.8284f, 20.3284f, 20.5f, 19.5f, 20.5f)
        horizontalLineTo(15f)
        moveTo(18f, 13f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 19f)
        curveTo(3f, 15.134f, 6.13401f, 12f, 10f, 12f)
        curveTo(11.0736f, 12f, 12.0907f, 12.2417f, 13f, 12.6736f)
        }
        }.build()

        return _userDollar!!
    }

private var _userDollar: ImageVector? = null
