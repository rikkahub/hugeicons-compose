package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GeologyCrust: ImageVector
    get() {
        if (_geologyCrust != null) {
            return _geologyCrust!!
        }
        _geologyCrust = ImageVector.Builder(
            name = "GeologyCrust",
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
        moveTo(12f, 2f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(10.3431f, 15f, 9f, 13.6569f, 9f, 12f)
        curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9997f, 18.5f)
        curveTo(10.4912f, 18.5f, 9.10269f, 17.9861f, 7.99972f, 17.1238f)
        moveTo(11.9997f, 5.5f)
        curveTo(9.10768f, 5.5f, 6.65678f, 7.38874f, 5.81322f, 10f)
        moveTo(6.23193f, 15f)
        curveTo(5.91116f, 14.3845f, 5.68601f, 13.7113f, 5.57617f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.49906f)
        curveTo(13.6241f, 5.61507f, 16.1849f, 5.23044f, 17.052f, 3.36719f)
        moveTo(20.0683f, 6.09014f)
        curveTo(19.6281f, 6.50486f, 19.1018f, 6.84862f, 18.5f, 6.99906f)
        curveTo(16.5f, 7.49906f, 14.5f, 8.99906f, 16f, 10.9991f)
        curveTo(17.5f, 12.9991f, 19f, 14.4991f, 17.5f, 16.4991f)
        curveTo(16.7608f, 17.4846f, 16.2402f, 19.1441f, 18.2806f, 19.7811f)
        }
        }.build()

        return _geologyCrust!!
    }

private var _geologyCrust: ImageVector? = null
