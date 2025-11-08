package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddFemale: ImageVector
    get() {
        if (_addFemale != null) {
            return _addFemale!!
        }
        _addFemale = ImageVector.Builder(
            name = "AddFemale",
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
        moveTo(13.5f, 16f)
        verticalLineTo(13.845f)
        curveTo(14.7848f, 13.6822f, 15.9696f, 13.397f, 17f, 13.0161f)
        curveTo(16.6667f, 12.3602f, 16f, 10.4579f, 16f, 8.09655f)
        curveTo(16f, 5.14483f, 16f, 2.68499f, 13f, 3.17672f)
        curveTo(11.5f, 1.20912f, 6f, 1.20919f, 6f, 7.11264f)
        curveTo(6f, 10.5563f, 5.5f, 12.0322f, 5f, 13.0161f)
        curveTo(6.03039f, 13.397f, 7.21522f, 13.6822f, 8.5f, 13.845f)
        verticalLineTo(16f)
        lineTo(4.78401f, 17.1177f)
        curveTo(3.39659f, 17.5423f, 2.36593f, 18.6553f, 2.02375f, 20.0099f)
        curveTo(1.88845f, 20.5456f, 2.35107f, 21f, 2.90639f, 21f)
        horizontalLineTo(13.0936f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 22f)
        lineTo(18.5f, 15f)
        moveTo(15f, 18.5f)
        horizontalLineTo(22f)
        }
        }.build()

        return _addFemale!!
    }

private var _addFemale: ImageVector? = null
