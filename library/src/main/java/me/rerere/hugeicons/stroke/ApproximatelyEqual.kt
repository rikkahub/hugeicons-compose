package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ApproximatelyEqual: ImageVector
    get() {
        if (_approximatelyEqual != null) {
            return _approximatelyEqual!!
        }
        _approximatelyEqual = ImageVector.Builder(
            name = "ApproximatelyEqual",
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
        moveTo(4f, 7.927f)
        curveTo(6.66667f, 4.9281f, 9.33333f, 5.80578f, 12f, 8f)
        curveTo(14.6667f, 10.1942f, 17.3333f, 11.0719f, 20f, 8.073f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15.927f)
        curveTo(6.66667f, 12.9281f, 9.33333f, 13.8058f, 12f, 16f)
        curveTo(14.6667f, 18.1942f, 17.3333f, 19.0719f, 20f, 16.073f)
        }
        }.build()

        return _approximatelyEqual!!
    }

private var _approximatelyEqual: ImageVector? = null
