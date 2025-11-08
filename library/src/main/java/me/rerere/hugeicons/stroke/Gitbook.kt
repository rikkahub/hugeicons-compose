package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Gitbook: ImageVector
    get() {
        if (_gitbook != null) {
            return _gitbook!!
        }
        _gitbook = ImageVector.Builder(
            name = "Gitbook",
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
        moveTo(5.68421f, 13.143f)
        lineTo(12.5263f, 16.6063f)
        lineTo(22f, 11.6587f)
        verticalLineTo(14.4523f)
        curveTo(22f, 15.1711f, 21.5855f, 15.8333f, 20.9171f, 16.1823f)
        lineTo(14.5609f, 19.5019f)
        curveTo(13.2948f, 20.1631f, 11.756f, 20.1662f, 10.4869f, 19.51f)
        lineTo(4.77515f, 16.5569f)
        curveTo(3.06346f, 15.6719f, 2f, 13.9811f, 2f, 12.1447f)
        moveTo(2f, 12.1447f)
        curveTo(2f, 10.1029f, 4.28574f, 8.77492f, 6.22844f, 9.68804f)
        lineTo(12.5263f, 12.6482f)
        lineTo(22f, 7.70056f)
        lineTo(15.7196f, 4.57498f)
        curveTo(14.0678f, 3.75288f, 12.076f, 3.81601f, 10.4868f, 4.74084f)
        lineTo(4.22963f, 8.38212f)
        curveTo(2.84349f, 9.18877f, 2f, 10.6122f, 2f, 12.1447f)
        }
        }.build()

        return _gitbook!!
    }

private var _gitbook: ImageVector? = null
