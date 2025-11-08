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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 17f)
        curveTo(2.5f, 18.9497f, 2.52815f, 21f, 4.9f, 21f)
        horizontalLineTo(16.1f)
        curveTo(18.4718f, 21f, 18.5f, 18.9497f, 18.5f, 17f)
        curveTo(18.5f, 12.5817f, 14.9183f, 9f, 10.5f, 9f)
        curveTo(6.08172f, 9f, 2.5f, 12.5817f, 2.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 9f)
        verticalLineTo(8f)
        curveTo(8.5f, 6.89543f, 9.39543f, 6f, 10.5f, 6f)
        curveTo(11.6046f, 6f, 12.5f, 6.89543f, 12.5f, 8f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 17f)
        curveTo(19.6046f, 17f, 20.5f, 16.1046f, 20.5f, 15f)
        verticalLineTo(13f)
        curveTo(20.5f, 11.8954f, 21.3954f, 11f, 22.5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 11.5f)
        verticalLineTo(9f)
        curveTo(16.5f, 5.68629f, 13.8137f, 3f, 10.5f, 3f)
        curveTo(7.18629f, 3f, 4.5f, 5.68629f, 4.5f, 9f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 17f)
        horizontalLineTo(12.5f)
        }
        }.build()

        return _kettle!!
    }

private var _kettle: ImageVector? = null
