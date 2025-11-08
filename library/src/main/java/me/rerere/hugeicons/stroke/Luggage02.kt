package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Luggage02: ImageVector
    get() {
        if (_luggage02 != null) {
            return _luggage02!!
        }
        _luggage02 = ImageVector.Builder(
            name = "Luggage02",
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
        moveTo(9f, 2f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2f)
        verticalLineTo(8f)
        moveTo(14f, 2f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 20.5f)
        verticalLineTo(22f)
        horizontalLineTo(9f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 20.5f)
        verticalLineTo(22f)
        horizontalLineTo(15f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 20.5f)
        horizontalLineTo(11f)
        curveTo(8.64298f, 20.5f, 7.46447f, 20.5f, 6.73223f, 19.7678f)
        curveTo(6f, 19.0355f, 6f, 17.857f, 6f, 15.5f)
        verticalLineTo(13f)
        curveTo(6f, 10.643f, 6f, 9.46447f, 6.73223f, 8.73223f)
        curveTo(7.46447f, 8f, 8.64298f, 8f, 11f, 8f)
        horizontalLineTo(13f)
        curveTo(15.357f, 8f, 16.5355f, 8f, 17.2678f, 8.73223f)
        curveTo(18f, 9.46447f, 18f, 10.643f, 18f, 13f)
        verticalLineTo(15.5f)
        curveTo(18f, 17.857f, 18f, 19.0355f, 17.2678f, 19.7678f)
        curveTo(16.5355f, 20.5f, 15.357f, 20.5f, 13f, 20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 11f)
        verticalLineTo(17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 11f)
        verticalLineTo(17.5f)
        }
        }.build()

        return _luggage02!!
    }

private var _luggage02: ImageVector? = null
