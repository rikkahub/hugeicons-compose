package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kettle: ImageVector
    get() {
        if (_kettle != null) {
            return _kettle!!
        }
        _kettle = ImageVector.Builder(
            name = "Kettle",
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
        moveTo(2f, 17f)
        curveTo(2f, 18.9497f, 2.02815f, 21f, 4.4f, 21f)
        horizontalLineTo(15.6f)
        curveTo(17.9718f, 21f, 18f, 18.9497f, 18f, 17f)
        curveTo(18f, 12.5817f, 14.4183f, 9f, 10f, 9f)
        curveTo(5.58172f, 9f, 2f, 12.5817f, 2f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        verticalLineTo(8f)
        curveTo(8f, 6.89543f, 8.89543f, 6f, 10f, 6f)
        curveTo(11.1046f, 6f, 12f, 6.89543f, 12f, 8f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 17f)
        curveTo(19.1046f, 17f, 20f, 16.1046f, 20f, 15f)
        verticalLineTo(13f)
        curveTo(20f, 11.8954f, 20.8954f, 11f, 22f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 11.5f)
        verticalLineTo(9f)
        curveTo(16f, 5.68629f, 13.3137f, 3f, 10f, 3f)
        curveTo(6.68629f, 3f, 4f, 5.68629f, 4f, 9f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        horizontalLineTo(12f)
        }
        }.build()

        return _kettle!!
    }

private var _kettle: ImageVector? = null
