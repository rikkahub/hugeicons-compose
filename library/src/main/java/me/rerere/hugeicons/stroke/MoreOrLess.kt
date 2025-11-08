package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreOrLess: ImageVector
    get() {
        if (_moreOrLess != null) {
            return _moreOrLess!!
        }
        _moreOrLess = ImageVector.Builder(
            name = "MoreOrLess",
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
        moveTo(4f, 12f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 6.99972f)
        lineTo(7.00316f, 7f)
        curveTo(5.18197f, 7f, 4.27137f, 7f, 4.04476f, 6.38268f)
        curveTo(3.81814f, 5.76537f, 4.46203f, 5.03884f, 5.7498f, 3.58579f)
        lineTo(6.26896f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 17.0003f)
        lineTo(16.9968f, 17f)
        curveTo(18.818f, 17f, 19.7286f, 17f, 19.9552f, 17.6173f)
        curveTo(20.1819f, 18.2346f, 19.538f, 18.9612f, 18.2502f, 20.4142f)
        lineTo(17.731f, 21f)
        }
        }.build()

        return _moreOrLess!!
    }

private var _moreOrLess: ImageVector? = null
