package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AdobePhotoshop: ImageVector
    get() {
        if (_adobePhotoshop != null) {
            return _adobePhotoshop!!
        }
        _adobePhotoshop = ImageVector.Builder(
            name = "AdobePhotoshop",
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
        moveTo(6.5f, 16f)
        verticalLineTo(12f)
        moveTo(6.5f, 12f)
        verticalLineTo(9.125f)
        curveTo(6.5f, 9.00892f, 6.5f, 8.95087f, 6.50482f, 8.90198f)
        curveTo(6.55158f, 8.42721f, 6.92721f, 8.05158f, 7.40198f, 8.00482f)
        curveTo(7.45087f, 8f, 7.50892f, 8f, 7.625f, 8f)
        horizontalLineTo(9f)
        curveTo(10.1046f, 8f, 11f, 8.89543f, 11f, 10f)
        curveTo(11f, 11.1046f, 10.1046f, 12f, 9f, 12f)
        horizontalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4658f, 11.2225f)
        curveTo(17.2923f, 10.5267f, 16.4782f, 10f, 15.5f, 10f)
        curveTo(14.3954f, 10f, 13.5f, 10.6716f, 13.5f, 11.5f)
        curveTo(13.5f, 12.3284f, 14.3954f, 13f, 15.5f, 13f)
        curveTo(16.6046f, 13f, 17.5f, 13.6716f, 17.5f, 14.5f)
        curveTo(17.5f, 15.3284f, 16.6046f, 16f, 15.5f, 16f)
        curveTo(14.5183f, 16f, 13.7019f, 15.4696f, 13.5323f, 14.77f)
        }
        }.build()

        return _adobePhotoshop!!
    }

private var _adobePhotoshop: ImageVector? = null
