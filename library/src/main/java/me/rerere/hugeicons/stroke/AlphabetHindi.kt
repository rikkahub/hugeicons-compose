package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlphabetHindi: ImageVector
    get() {
        if (_alphabetHindi != null) {
            return _alphabetHindi!!
        }
        _alphabetHindi = ImageVector.Builder(
            name = "AlphabetHindi",
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
        moveTo(5.59988f, 5.65676f)
        curveTo(6.79984f, 4.48521f, 9.79974f, 3.3138f, 11.5997f, 4.48521f)
        curveTo(14.9486f, 6.66473f, 12.8f, 10.3431f, 9.20016f, 10.9288f)
        curveTo(10.8001f, 10.9288f, 14f, 11.6318f, 14f, 14.4435f)
        curveTo(14f, 18.7942f, 9.19988f, 21.1845f, 5.6f, 19.4092f)
        curveTo(2.00012f, 17.6339f, 2f, 14.7573f, 2f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.0006f, 10f)
        curveTo(18.052f, 13.7503f, 14.9728f, 13.2464f, 13.1992f, 12.3941f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        lineTo(19f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 4f)
        curveTo(17.5f, 4.43301f, 19.5f, 4.86603f, 22f, 4f)
        }
        }.build()

        return _alphabetHindi!!
    }

private var _alphabetHindi: ImageVector? = null
