package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = ImageVector.Builder(
            name = "Gift",
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
        moveTo(4f, 11f)
        verticalLineTo(15f)
        curveTo(4f, 18.2998f, 4f, 19.9497f, 5.02513f, 20.9749f)
        curveTo(6.05025f, 22f, 7.70017f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.2998f, 22f, 17.9497f, 22f, 18.9749f, 20.9749f)
        curveTo(20f, 19.9497f, 20f, 18.2998f, 20f, 15f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9f)
        curveTo(3f, 8.25231f, 3f, 7.87846f, 3.20096f, 7.6f)
        curveTo(3.33261f, 7.41758f, 3.52197f, 7.26609f, 3.75f, 7.16077f)
        curveTo(4.09808f, 7f, 4.56538f, 7f, 5.5f, 7f)
        horizontalLineTo(18.5f)
        curveTo(19.4346f, 7f, 19.9019f, 7f, 20.25f, 7.16077f)
        curveTo(20.478f, 7.26609f, 20.6674f, 7.41758f, 20.799f, 7.6f)
        curveTo(21f, 7.87846f, 21f, 8.25231f, 21f, 9f)
        curveTo(21f, 9.74769f, 21f, 10.1215f, 20.799f, 10.4f)
        curveTo(20.6674f, 10.5824f, 20.478f, 10.7339f, 20.25f, 10.8392f)
        curveTo(19.9019f, 11f, 19.4346f, 11f, 18.5f, 11f)
        horizontalLineTo(5.5f)
        curveTo(4.56538f, 11f, 4.09808f, 11f, 3.75f, 10.8392f)
        curveTo(3.52197f, 10.7339f, 3.33261f, 10.5824f, 3.20096f, 10.4f)
        curveTo(3f, 10.1215f, 3f, 9.74769f, 3f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 3.78571f)
        curveTo(6f, 2.79949f, 6.79949f, 2f, 7.78571f, 2f)
        horizontalLineTo(8.14286f)
        curveTo(10.2731f, 2f, 12f, 3.7269f, 12f, 5.85714f)
        verticalLineTo(7f)
        horizontalLineTo(9.21429f)
        curveTo(7.43908f, 7f, 6f, 5.56091f, 6f, 3.78571f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 3.78571f)
        curveTo(18f, 2.79949f, 17.2005f, 2f, 16.2143f, 2f)
        horizontalLineTo(15.8571f)
        curveTo(13.7269f, 2f, 12f, 3.7269f, 12f, 5.85714f)
        verticalLineTo(7f)
        horizontalLineTo(14.7857f)
        curveTo(16.5609f, 7f, 18f, 5.56091f, 18f, 3.78571f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        lineTo(12f, 22f)
        }
        }.build()

        return _gift!!
    }

private var _gift: ImageVector? = null
