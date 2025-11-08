package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AlignSelection: ImageVector
    get() {
        if (_alignSelection != null) {
            return _alignSelection!!
        }
        _alignSelection = ImageVector.Builder(
            name = "AlignSelection",
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
        moveTo(20f, 6f)
        verticalLineTo(18f)
        moveTo(18f, 4f)
        horizontalLineTo(6f)
        moveTo(18f, 20f)
        horizontalLineTo(6f)
        moveTo(4f, 18f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 4f)
        curveTo(22f, 5.10457f, 21.1046f, 6f, 20f, 6f)
        curveTo(18.8954f, 6f, 18f, 5.10457f, 18f, 4f)
        curveTo(18f, 2.89543f, 18.8954f, 2f, 20f, 2f)
        curveTo(21.1046f, 2f, 22f, 2.89543f, 22f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 4f)
        curveTo(6f, 5.10457f, 5.10457f, 6f, 4f, 6f)
        curveTo(2.89543f, 6f, 2f, 5.10457f, 2f, 4f)
        curveTo(2f, 2.89543f, 2.89543f, 2f, 4f, 2f)
        curveTo(5.10457f, 2f, 6f, 2.89543f, 6f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 20f)
        curveTo(22f, 21.1046f, 21.1046f, 22f, 20f, 22f)
        curveTo(18.8954f, 22f, 18f, 21.1046f, 18f, 20f)
        curveTo(18f, 18.8954f, 18.8954f, 18f, 20f, 18f)
        curveTo(21.1046f, 18f, 22f, 18.8954f, 22f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 20f)
        curveTo(6f, 21.1046f, 5.10457f, 22f, 4f, 22f)
        curveTo(2.89543f, 22f, 2f, 21.1046f, 2f, 20f)
        curveTo(2f, 18.8954f, 2.89543f, 18f, 4f, 18f)
        curveTo(5.10457f, 18f, 6f, 18.8954f, 6f, 20f)
        }
        }.build()

        return _alignSelection!!
    }

private var _alignSelection: ImageVector? = null
