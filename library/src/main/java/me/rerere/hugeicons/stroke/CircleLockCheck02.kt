package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleLockCheck02: ImageVector
    get() {
        if (_circleLockCheck02 != null) {
            return _circleLockCheck02!!
        }
        _circleLockCheck02 = ImageVector.Builder(
            name = "CircleLockCheck02",
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
        moveTo(10.9635f, 21.9824f)
        curveTo(10.7992f, 21.9941f, 10.6333f, 22f, 10.466f, 22f)
        curveTo(6.61877f, 22f, 3.5f, 18.866f, 3.5f, 15f)
        curveTo(3.5f, 11.134f, 6.61877f, 8f, 10.466f, 8f)
        curveTo(12.8331f, 8f, 15f, 9f, 16f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9.5f)
        verticalLineTo(6.5f)
        curveTo(15f, 4.01472f, 12.9853f, 2f, 10.5f, 2f)
        curveTo(8.01472f, 2f, 6f, 4.01472f, 6f, 6.5f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.168f, 18.4436f)
        curveTo(15.468f, 18.5876f, 15.84f, 18.9596f, 16.02f, 19.2596f)
        curveTo(16.08f, 19.6796f, 16.38f, 18.0596f, 17.844f, 17.0996f)
        }
        }.build()

        return _circleLockCheck02!!
    }

private var _circleLockCheck02: ImageVector? = null
