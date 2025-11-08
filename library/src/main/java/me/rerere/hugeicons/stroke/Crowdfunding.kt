package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crowdfunding: ImageVector
    get() {
        if (_crowdfunding != null) {
            return _crowdfunding!!
        }
        _crowdfunding = ImageVector.Builder(
            name = "Crowdfunding",
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
        moveTo(20f, 15f)
        curveTo(20f, 13.8954f, 18.8807f, 13f, 17.5f, 13f)
        horizontalLineTo(6.5f)
        curveTo(5.11929f, 13f, 4f, 13.8954f, 4f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        lineTo(12f, 15f)
        }
        }.build()

        return _crowdfunding!!
    }

private var _crowdfunding: ImageVector? = null
