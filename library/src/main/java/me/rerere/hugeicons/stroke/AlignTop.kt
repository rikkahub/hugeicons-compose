package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = ImageVector.Builder(
            name = "AlignTop",
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
        moveTo(16.502f, 7.99988f)
        curveTo(17.3458f, 7.99988f, 18.3198f, 7.9165f, 18.801f, 8.74988f)
        curveTo(19.002f, 9.09795f, 19.002f, 9.56526f, 19.002f, 10.4999f)
        verticalLineTo(11.4999f)
        curveTo(19.002f, 12.4345f, 19.002f, 12.9018f, 18.801f, 13.2499f)
        curveTo(18.3198f, 14.0832f, 17.3458f, 13.9999f, 16.502f, 13.9999f)
        curveTo(15.6581f, 13.9999f, 14.6841f, 14.0832f, 14.2029f, 13.2499f)
        curveTo(14.002f, 12.9018f, 14.002f, 12.4345f, 14.002f, 11.4999f)
        lineTo(14.002f, 10.4999f)
        curveTo(14.002f, 9.56526f, 14.002f, 9.09795f, 14.2029f, 8.74988f)
        curveTo(14.6841f, 7.9165f, 15.6581f, 7.99988f, 16.502f, 7.99988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50195f, 7.99988f)
        curveTo(8.34585f, 7.99988f, 9.31984f, 7.9165f, 9.80099f, 8.74988f)
        curveTo(10.002f, 9.09795f, 10.002f, 9.56526f, 10.002f, 10.4999f)
        lineTo(10.002f, 17.4999f)
        curveTo(10.002f, 18.4345f, 10.002f, 18.9018f, 9.80099f, 19.2499f)
        curveTo(9.31984f, 20.0832f, 8.34585f, 19.9999f, 7.50195f, 19.9999f)
        curveTo(6.65806f, 19.9999f, 5.68406f, 20.0832f, 5.20292f, 19.2499f)
        curveTo(5.00195f, 18.9018f, 5.00195f, 18.4345f, 5.00195f, 17.4999f)
        lineTo(5.00195f, 10.4999f)
        curveTo(5.00195f, 9.56526f, 5.00195f, 9.09795f, 5.20292f, 8.74988f)
        curveTo(5.68406f, 7.9165f, 6.65806f, 7.99988f, 7.50195f, 7.99988f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4f)
        lineTo(2f, 4f)
        }
        }.build()

        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
