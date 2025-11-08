package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FingerAccess: ImageVector
    get() {
        if (_fingerAccess != null) {
            return _fingerAccess!!
        }
        _fingerAccess = ImageVector.Builder(
            name = "FingerAccess",
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
        moveTo(18f, 12f)
        curveTo(18f, 8.68628f, 15.3137f, 6f, 12f, 6f)
        curveTo(8.68628f, 6f, 6f, 8.68628f, 6f, 12f)
        curveTo(6f, 15.3136f, 7f, 17.5f, 8.99985f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 21f)
        curveTo(9.5f, 17.5f, 9f, 13.6568f, 9f, 12f)
        curveTo(9f, 10.3431f, 10.3431f, 9f, 12f, 9f)
        curveTo(13.6569f, 9f, 15f, 10.3431f, 15f, 12f)
        curveTo(15f, 13.6569f, 16.3431f, 15f, 18f, 15f)
        curveTo(19.6569f, 15f, 21f, 13.6569f, 21f, 12f)
        curveTo(21f, 7.02942f, 16.9706f, 3f, 12f, 3f)
        curveTo(7.02942f, 3f, 3f, 7.02942f, 3f, 12f)
        curveTo(3f, 12.6874f, 3.07707f, 13.3568f, 3.22303f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        curveTo(12.5f, 17f, 17.5f, 19f, 17.5f, 19f)
        }
        }.build()

        return _fingerAccess!!
    }

private var _fingerAccess: ImageVector? = null
