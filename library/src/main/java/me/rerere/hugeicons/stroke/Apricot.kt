package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Apricot: ImageVector
    get() {
        if (_apricot != null) {
            return _apricot!!
        }
        _apricot = ImageVector.Builder(
            name = "Apricot",
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
        moveTo(10.201f, 20f)
        curveTo(11.3469f, 21.2447f, 12.852f, 22f, 14.5005f, 22f)
        curveTo(18.0903f, 22f, 21.0005f, 18.4183f, 21.0005f, 14f)
        curveTo(21.0005f, 9.58172f, 18.0903f, 6f, 14.5005f, 6f)
        curveTo(11.1858f, 6f, 8.39983f, 9.05369f, 8f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21.3869f)
        curveTo(11.2304f, 21.7819f, 10.3859f, 22f, 9.5f, 22f)
        curveTo(5.91015f, 22f, 3f, 18.4183f, 3f, 14f)
        curveTo(3f, 9.58172f, 5.91015f, 6f, 9.5f, 6f)
        curveTo(10.3859f, 6f, 11.2304f, 6.21813f, 12f, 6.61312f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        curveTo(12f, 4.66667f, 12.6f, 2f, 15f, 2f)
        }
        }.build()

        return _apricot!!
    }

private var _apricot: ImageVector? = null
