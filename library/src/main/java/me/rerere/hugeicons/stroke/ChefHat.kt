package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = ImageVector.Builder(
            name = "ChefHat",
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
        moveTo(18f, 13f)
        curveTo(20.2091f, 13f, 22f, 11.2091f, 22f, 9f)
        curveTo(22f, 6.79086f, 20.2091f, 5f, 18f, 5f)
        curveTo(17.1767f, 5f, 16.4115f, 5.24874f, 15.7754f, 5.67518f)
        moveTo(6f, 13f)
        curveTo(3.79086f, 13f, 2f, 11.2091f, 2f, 9f)
        curveTo(2f, 6.79086f, 3.79086f, 5f, 6f, 5f)
        curveTo(6.82332f, 5f, 7.58854f, 5.24874f, 8.22461f, 5.67518f)
        moveTo(15.7754f, 5.67518f)
        curveTo(15.2287f, 4.11714f, 13.7448f, 3f, 12f, 3f)
        curveTo(10.2552f, 3f, 8.77132f, 4.11714f, 8.22461f, 5.67518f)
        moveTo(15.7754f, 5.67518f)
        curveTo(15.9209f, 6.08981f, 16f, 6.53566f, 16f, 7f)
        curveTo(16f, 7.3453f, 15.9562f, 7.68038f, 15.874f, 8f)
        moveTo(9.46487f, 7f)
        curveTo(9.15785f, 6.46925f, 8.73238f, 6.0156f, 8.22461f, 5.67518f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 17.5f)
        curveTo(7.59905f, 16.8776f, 9.69952f, 16.5f, 12f, 16.5f)
        curveTo(14.3005f, 16.5f, 16.401f, 16.8776f, 18f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 21f)
        curveTo(6.86556f, 20.3776f, 9.3161f, 20f, 12f, 20f)
        curveTo(14.6839f, 20f, 17.1344f, 20.3776f, 19f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        verticalLineTo(20f)
        moveTo(6f, 12f)
        verticalLineTo(20f)
        }
        }.build()

        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
