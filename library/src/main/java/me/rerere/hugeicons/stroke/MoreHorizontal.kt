package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreHorizontal: ImageVector
    get() {
        if (_moreHorizontal != null) {
            return _moreHorizontal!!
        }
        _moreHorizontal = ImageVector.Builder(
            name = "MoreHorizontal",
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
        moveTo(12.0045f, 11.5f)
        curveTo(12.5568f, 11.5f, 13.0045f, 11.9477f, 13.0045f, 12.5f)
        curveTo(13.0045f, 13.0523f, 12.5568f, 13.5f, 12.0045f, 13.5f)
        curveTo(11.4522f, 13.5f, 11.0045f, 13.0523f, 11.0045f, 12.5f)
        curveTo(11.0045f, 11.9477f, 11.4522f, 11.5f, 12.0045f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0045f, 11.5f)
        curveTo(18.5568f, 11.5f, 19.0045f, 11.9477f, 19.0045f, 12.5f)
        curveTo(19.0045f, 13.0523f, 18.5568f, 13.5f, 18.0045f, 13.5f)
        curveTo(17.4522f, 13.5f, 17.0045f, 13.0523f, 17.0045f, 12.5f)
        curveTo(17.0045f, 11.9477f, 17.4522f, 11.5f, 18.0045f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.00449f, 11.5f)
        curveTo(6.55677f, 11.5f, 7.00449f, 11.9477f, 7.00449f, 12.5f)
        curveTo(7.00449f, 13.0523f, 6.55677f, 13.5f, 6.00449f, 13.5f)
        curveTo(5.4522f, 13.5f, 5.00449f, 13.0523f, 5.00449f, 12.5f)
        curveTo(5.00449f, 11.9477f, 5.4522f, 11.5f, 6.00449f, 11.5f)
        }
        }.build()

        return _moreHorizontal!!
    }

private var _moreHorizontal: ImageVector? = null
