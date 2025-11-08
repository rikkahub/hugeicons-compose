package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = ImageVector.Builder(
            name = "Lifebuoy",
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
        moveTo(21f, 12f)
        curveTo(21f, 16.9706f, 16.9706f, 21f, 12f, 21f)
        curveTo(7.02944f, 21f, 3f, 16.9706f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(16.9706f, 3f, 21f, 7.02944f, 21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        curveTo(14.7614f, 7f, 17f, 9.23858f, 17f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        verticalLineTo(3f)
        moveTo(12f, 17f)
        verticalLineTo(21f)
        moveTo(17f, 12f)
        horizontalLineTo(21f)
        moveTo(7f, 12f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.8965f, 3.47625f)
        curveTo(15.63f, 2.57541f, 16.7478f, 2f, 18f, 2f)
        curveTo(20.2091f, 2f, 22f, 3.79086f, 22f, 6f)
        curveTo(22f, 7.25222f, 21.4246f, 8.37005f, 20.5238f, 9.1035f)
        moveTo(20.5238f, 14.8965f)
        curveTo(21.4246f, 15.63f, 22f, 16.7478f, 22f, 18f)
        curveTo(22f, 20.2091f, 20.2091f, 22f, 18f, 22f)
        curveTo(16.7478f, 22f, 15.63f, 21.4246f, 14.8965f, 20.5238f)
        moveTo(9.1035f, 20.5238f)
        curveTo(8.37005f, 21.4246f, 7.25222f, 22f, 6f, 22f)
        curveTo(3.79086f, 22f, 2f, 20.2091f, 2f, 18f)
        curveTo(2f, 16.7478f, 2.57541f, 15.63f, 3.47625f, 14.8965f)
        moveTo(3.47625f, 9.1035f)
        curveTo(2.57541f, 8.37005f, 2f, 7.25222f, 2f, 6f)
        curveTo(2f, 3.79086f, 3.79086f, 2f, 6f, 2f)
        curveTo(7.25222f, 2f, 8.37005f, 2.57541f, 9.1035f, 3.47625f)
        }
        }.build()

        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
