package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = ImageVector.Builder(
            name = "Tractor",
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
        moveTo(2f, 10.4995f)
        curveTo(3.25349f, 9.55792f, 4.81159f, 9f, 6.5f, 9f)
        curveTo(10.6421f, 9f, 14f, 12.3579f, 14f, 16.5f)
        curveTo(14f, 16.596f, 13.9982f, 16.6915f, 13.9946f, 16.7866f)
        curveTo(13.9719f, 17.3913f, 13.9605f, 17.6937f, 14.1081f, 17.8469f)
        curveTo(14.2556f, 18f, 14.5282f, 18f, 15.0734f, 18f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        lineTo(16.1057f, 9.58232f)
        curveTo(18.4466f, 10.0212f, 19.6171f, 10.2407f, 20.3085f, 11.0739f)
        curveTo(21f, 11.907f, 21f, 13.1047f, 21f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 12f)
        lineTo(19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12.5f)
        verticalLineTo(9.58708f)
        curveTo(13f, 9.19778f, 12.9432f, 8.81056f, 12.8313f, 8.43768f)
        lineTo(11.5f, 3f)
        moveTo(4f, 9f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9.5f)
        verticalLineTo(8f)
        curveTo(18f, 6.89543f, 18.8954f, 6f, 20f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9f)
        verticalLineTo(3f)
        }
        }.build()

        return _tractor!!
    }

private var _tractor: ImageVector? = null
