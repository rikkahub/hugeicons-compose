package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookOpen02: ImageVector
    get() {
        if (_bookOpen02 != null) {
            return _bookOpen02!!
        }
        _bookOpen02 = ImageVector.Builder(
            name = "BookOpen02",
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
        moveTo(17.5055f, 2.01874f)
        curveTo(12.8289f, 2.83455f, 12f, 7.5f, 12f, 7.5f)
        verticalLineTo(22f)
        curveTo(12f, 22f, 12.8867f, 17.1272f, 18.0004f, 16.5588f)
        curveTo(18.5493f, 16.4978f, 19f, 16.0576f, 19f, 15.5058f)
        verticalLineTo(3.39309f)
        curveTo(19f, 2.5654f, 18.3216f, 1.87638f, 17.5055f, 2.01874f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.33333f, 5.00001f)
        curveTo(7.79379f, 4.99657f, 10.1685f, 5.88709f, 12f, 7.5f)
        verticalLineTo(22f)
        curveTo(10.1685f, 20.3871f, 7.79379f, 19.4966f, 5.33333f, 19.5f)
        curveTo(3.77132f, 19.5f, 2.99032f, 19.5f, 2.64526f, 19.2792f)
        curveTo(2.4381f, 19.1466f, 2.35346f, 19.0619f, 2.22086f, 18.8547f)
        curveTo(2f, 18.5097f, 2f, 17.8941f, 2f, 16.6629f)
        verticalLineTo(8.40322f)
        curveTo(2f, 6.97543f, 2f, 6.26154f, 2.54874f, 5.68286f)
        curveTo(3.09748f, 5.10418f, 3.65923f, 5.07432f, 4.78272f, 5.0146f)
        curveTo(4.965f, 5.00491f, 5.14858f, 5.00001f, 5.33333f, 5.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22.001f)
        curveTo(13.8315f, 20.3881f, 16.2062f, 19.4976f, 18.6667f, 19.501f)
        curveTo(20.2287f, 19.501f, 21.0097f, 19.501f, 21.3547f, 19.2802f)
        curveTo(21.5619f, 19.1476f, 21.6465f, 19.0629f, 21.7791f, 18.8558f)
        curveTo(22f, 18.5107f, 22f, 17.8951f, 22f, 16.6639f)
        verticalLineTo(8.40424f)
        curveTo(22f, 6.97645f, 22f, 6.26256f, 21.4513f, 5.68388f)
        curveTo(20.9025f, 5.1052f, 20.1235f, 5.05972f, 19f, 5f)
        }
        }.build()

        return _bookOpen02!!
    }

private var _bookOpen02: ImageVector? = null
