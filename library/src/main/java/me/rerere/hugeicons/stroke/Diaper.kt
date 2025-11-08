package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Diaper: ImageVector
    get() {
        if (_diaper != null) {
            return _diaper!!
        }
        _diaper = ImageVector.Builder(
            name = "Diaper",
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
        moveTo(2f, 7.69231f)
        curveTo(2f, 7.04903f, 2f, 6.72738f, 2.04914f, 6.45923f)
        curveTo(2.27382f, 5.2332f, 3.2332f, 4.27382f, 4.45923f, 4.04914f)
        curveTo(4.72738f, 4f, 5.04903f, 4f, 5.69231f, 4f)
        horizontalLineTo(18.3077f)
        curveTo(18.951f, 4f, 19.2726f, 4f, 19.5408f, 4.04914f)
        curveTo(20.7668f, 4.27382f, 21.7262f, 5.2332f, 21.9509f, 6.45923f)
        curveTo(22f, 6.72738f, 22f, 7.04903f, 22f, 7.69231f)
        verticalLineTo(10f)
        curveTo(22f, 15.5228f, 17.5228f, 20f, 12f, 20f)
        curveTo(6.47715f, 20f, 2f, 15.5228f, 2f, 10f)
        verticalLineTo(7.69231f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 19.5f)
        verticalLineTo(18.5f)
        curveTo(14.5f, 14.634f, 17.634f, 11.5f, 21.5f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 19.5f)
        verticalLineTo(18.5f)
        curveTo(9.5f, 14.634f, 6.36599f, 11.5f, 2.5f, 11.5f)
        }
        }.build()

        return _diaper!!
    }

private var _diaper: ImageVector? = null
