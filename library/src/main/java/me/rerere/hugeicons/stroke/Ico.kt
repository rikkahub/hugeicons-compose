package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ico: ImageVector
    get() {
        if (_ico != null) {
            return _ico!!
        }
        _ico = ImageVector.Builder(
            name = "Ico",
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
        moveTo(12f, 2f)
        curveTo(6.47716f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9.49982f)
        verticalLineTo(14.4998f)
        moveTo(12.5f, 13.4997f)
        curveTo(12.5f, 14.052f, 12.0523f, 14.4997f, 11.5f, 14.4997f)
        horizontalLineTo(9.5f)
        curveTo(8.94771f, 14.4997f, 8.5f, 14.052f, 8.5f, 13.4997f)
        verticalLineTo(10.4998f)
        curveTo(8.5f, 9.94746f, 8.94773f, 9.49974f, 9.50002f, 9.49975f)
        lineTo(11.5001f, 9.4998f)
        curveTo(12.0523f, 9.49981f, 12.5f, 9.94749f, 12.5f, 10.4997f)
        moveTo(15f, 11.4998f)
        verticalLineTo(12.4998f)
        curveTo(15f, 13.6044f, 15.8954f, 14.4998f, 17f, 14.4998f)
        curveTo(18.1046f, 14.4998f, 19f, 13.6044f, 19f, 12.4998f)
        verticalLineTo(11.4998f)
        curveTo(19f, 10.3952f, 18.1046f, 9.49982f, 17f, 9.49982f)
        curveTo(15.8954f, 9.49982f, 15f, 10.3952f, 15f, 11.4998f)
        }
        }.build()

        return _ico!!
    }

private var _ico: ImageVector? = null
