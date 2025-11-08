package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AppleFinder: ImageVector
    get() {
        if (_appleFinder != null) {
            return _appleFinder!!
        }
        _appleFinder = ImageVector.Builder(
            name = "AppleFinder",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 8f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 16.5f)
        curveTo(10.5f, 18.5f, 13.5f, 18.5f, 17f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9896f, 2.5f)
        curveTo(12.1238f, 3.78525f, 10.5163f, 7.71349f, 10.0737f, 11.5798f)
        curveTo(9.98097f, 12.3899f, 9.9346f, 12.795f, 10.1905f, 13.1176f)
        curveTo(10.2151f, 13.1486f, 10.2474f, 13.1843f, 10.2757f, 13.212f)
        curveTo(10.5708f, 13.5f, 11.0149f, 13.5f, 11.9031f, 13.5f)
        curveTo(12.3889f, 13.5f, 12.6317f, 13.5f, 12.7766f, 13.6314f)
        curveTo(12.7923f, 13.6457f, 12.8051f, 13.6588f, 12.819f, 13.6748f)
        curveTo(12.9468f, 13.8225f, 12.9383f, 14.072f, 12.9212f, 14.5709f)
        curveTo(12.8685f, 16.1156f, 12.9401f, 19.0524f, 14f, 21.5f)
        }
        }.build()

        return _appleFinder!!
    }

private var _appleFinder: ImageVector? = null
