package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckmarkCircle03: ImageVector
    get() {
        if (_checkmarkCircle03 != null) {
            return _checkmarkCircle03!!
        }
        _checkmarkCircle03 = ImageVector.Builder(
            name = "CheckmarkCircle03",
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
        moveTo(17f, 3.33782f)
        curveTo(15.5291f, 2.48697f, 13.8214f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.3151f, 21.9311f, 10.6462f, 21.8f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 12.5f)
        curveTo(8f, 12.5f, 9.5f, 12.5f, 11.5f, 16f)
        curveTo(11.5f, 16f, 17.0588f, 6.83333f, 22f, 5f)
        }
        }.build()

        return _checkmarkCircle03!!
    }

private var _checkmarkCircle03: ImageVector? = null
