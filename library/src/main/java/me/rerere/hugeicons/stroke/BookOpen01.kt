package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BookOpen01: ImageVector
    get() {
        if (_bookOpen01 != null) {
            return _bookOpen01!!
        }
        _bookOpen01 = ImageVector.Builder(
            name = "BookOpen01",
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
        moveTo(5.33333f, 3.00001f)
        curveTo(7.79379f, 2.99657f, 10.1685f, 3.88709f, 12f, 5.5f)
        verticalLineTo(21f)
        curveTo(10.1685f, 19.3871f, 7.79379f, 18.4966f, 5.33333f, 18.5f)
        curveTo(3.77132f, 18.5f, 2.99032f, 18.5f, 2.64526f, 18.2792f)
        curveTo(2.4381f, 18.1466f, 2.35346f, 18.0619f, 2.22086f, 17.8547f)
        curveTo(2f, 17.5097f, 2f, 16.8941f, 2f, 15.6629f)
        verticalLineTo(6.40322f)
        curveTo(2f, 4.97543f, 2f, 4.26154f, 2.54874f, 3.68286f)
        curveTo(3.09748f, 3.10418f, 3.65923f, 3.07432f, 4.78272f, 3.0146f)
        curveTo(4.965f, 3.00491f, 5.14858f, 3.00001f, 5.33333f, 3.00001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.6667f, 3.00001f)
        curveTo(16.2062f, 2.99657f, 13.8315f, 3.88709f, 12f, 5.5f)
        verticalLineTo(21f)
        curveTo(13.8315f, 19.3871f, 16.2062f, 18.4966f, 18.6667f, 18.5f)
        curveTo(20.2287f, 18.5f, 21.0097f, 18.5f, 21.3547f, 18.2792f)
        curveTo(21.5619f, 18.1466f, 21.6465f, 18.0619f, 21.7791f, 17.8547f)
        curveTo(22f, 17.5097f, 22f, 16.8941f, 22f, 15.6629f)
        verticalLineTo(6.40322f)
        curveTo(22f, 4.97543f, 22f, 4.26154f, 21.4513f, 3.68286f)
        curveTo(20.9025f, 3.10418f, 20.3408f, 3.07432f, 19.2173f, 3.0146f)
        curveTo(19.035f, 3.00491f, 18.8514f, 3.00001f, 18.6667f, 3.00001f)
        }
        }.build()

        return _bookOpen01!!
    }

private var _bookOpen01: ImageVector? = null
