package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DistributeVerticalTop: ImageVector
    get() {
        if (_distributeVerticalTop != null) {
            return _distributeVerticalTop!!
        }
        _distributeVerticalTop = ImageVector.Builder(
            name = "DistributeVerticalTop",
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
        moveTo(1.99988f, 2f)
        lineTo(21.9999f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(1.99988f, 14f)
        lineTo(21.9999f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.0022f, 7.5f)
        curveTo(8.0022f, 6.65611f, 7.91882f, 5.68211f, 8.7522f, 5.20096f)
        curveTo(9.10027f, 5f, 9.56758f, 5f, 10.5022f, 5f)
        horizontalLineTo(13.5022f)
        curveTo(14.4368f, 5f, 14.9041f, 5f, 15.2522f, 5.20096f)
        curveTo(16.0856f, 5.68211f, 16.0022f, 6.65611f, 16.0022f, 7.5f)
        curveTo(16.0022f, 8.34389f, 16.0856f, 9.31789f, 15.2522f, 9.79904f)
        curveTo(14.9041f, 10f, 14.4368f, 10f, 13.5022f, 10f)
        lineTo(10.5022f, 10f)
        curveTo(9.56758f, 10f, 9.10027f, 10f, 8.7522f, 9.79904f)
        curveTo(7.91882f, 9.31789f, 8.0022f, 8.34389f, 8.0022f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.0022f, 19.5f)
        curveTo(5.0022f, 18.6561f, 4.91882f, 17.6821f, 5.7522f, 17.201f)
        curveTo(6.10027f, 17f, 6.56758f, 17f, 7.5022f, 17f)
        lineTo(16.5022f, 17f)
        curveTo(17.4368f, 17f, 17.9041f, 17f, 18.2522f, 17.201f)
        curveTo(19.0856f, 17.6821f, 19.0022f, 18.6561f, 19.0022f, 19.5f)
        curveTo(19.0022f, 20.3439f, 19.0856f, 21.3179f, 18.2522f, 21.799f)
        curveTo(17.9041f, 22f, 17.4368f, 22f, 16.5022f, 22f)
        lineTo(7.5022f, 22f)
        curveTo(6.56758f, 22f, 6.10027f, 22f, 5.7522f, 21.799f)
        curveTo(4.91882f, 21.3179f, 5.0022f, 20.3439f, 5.0022f, 19.5f)
        }
        }.build()

        return _distributeVerticalTop!!
    }

private var _distributeVerticalTop: ImageVector? = null
